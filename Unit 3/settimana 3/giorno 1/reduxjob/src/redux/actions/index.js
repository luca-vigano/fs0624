export const ADD_TO_FAVORITES = "ADD_TO_FAVORITES";
export const REMOVE_FROM_FAVORITES = "REMOVE_FROM_FAVORITES";
export const SET_USER_NAME = "SET_USER_NAME";
export const GET_COMPANIES = "GET_COMPANIES";

export const addToFavoriteAction = (company) => {
  return {
    type: ADD_TO_FAVORITES,
    payload: company,
  };
};

export const removeFromFavorites = (i) => {
  return {
    type: REMOVE_FROM_FAVORITES,
    payload: i,
  };
};

export const setUserNameAction = (name) => {
  return {
    type: SET_USER_NAME,
    payload: name,
  };
};

export const getResultsAction = (query) => {
  return (dispatch, getState) => {
    fetch(
      "https://strive-benchmark.herokuapp.com/api/jobs?search=" +
        query +
        "&limit=20"
    )
      .then((response) => {
        if (response.ok) {
          return response.json();
        } else {
          throw new Error("errore nel recupero companies");
        }
      })
      .then((arrayOfCompanies) => {
        dispatch({
          type: GET_COMPANIES,
          payload: arrayOfCompanies.data,
        });
      })
      .catch((err) => {
        console.log(err);
      });
  };
};
