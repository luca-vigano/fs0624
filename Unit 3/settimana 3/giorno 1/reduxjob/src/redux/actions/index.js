export const ADD_TO_FAVORITES = "ADD_TO_FAVORITES";
export const REMOVE_FROM_FAVORITES = "REMOVE_FROM_FAVORITES";

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
