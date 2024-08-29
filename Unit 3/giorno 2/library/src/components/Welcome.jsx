import Alert from "react-bootstrap/Alert";

const Welcome = () => {
  return (
    <>
      <Alert className="text-center" variant="primary" data-testid="Alert">
        ciao sono un sottotitolo
      </Alert>
    </>
  );
};

export default Welcome;
