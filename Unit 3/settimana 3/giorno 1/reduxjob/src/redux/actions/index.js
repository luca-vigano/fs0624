export const addToFavoriteAction = (company) => {
  return {
    type: "ADD_TO_FAVORITES",
    payload: company,
  };
};
