package luca.vigano.securityJWT.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import luca.vigano.securityJWT.entities.Dipendente;
import luca.vigano.securityJWT.exception.UnauthorizedException;
import luca.vigano.securityJWT.services.DipendenteService;
import luca.vigano.securityJWT.tools.JWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.UUID;

@Component
public class JWTCheckerFilter extends OncePerRequestFilter {

    @Autowired
    private JWT jwt;
    @Autowired
    private DipendenteService dipendenteService;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authHeader = request.getHeader("Authorization");
        if (authHeader == null || !authHeader.startsWith("Bearer "))
            throw new UnauthorizedException("Inserire token nell'Authorization Header nel formato corretto!");

        String accessToken = authHeader.substring(7);
        jwt.verifyToken(accessToken);


        String dipendenteId= jwt.getIdFromToken(accessToken);
        Dipendente dipendenteCorrente = this.dipendenteService.findById(UUID.fromString(dipendenteId));
        Authentication authentication = new UsernamePasswordAuthenticationToken(dipendenteCorrente,null,dipendenteCorrente.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);

        filterChain.doFilter(request, response);
    }

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        return new AntPathMatcher().match("/auth/**", request.getServletPath());
    }

    }

