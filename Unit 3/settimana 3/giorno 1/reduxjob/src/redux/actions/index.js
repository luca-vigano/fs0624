export const ADD_TO_FAVORITES = "ADD_TO_FAVORITES";
export const REMOVE_FROM_FAVORITES = "REMOVE_FROM_FAVORITES";
export const SET_USER_NAME = "SET_USER_NAME";

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
