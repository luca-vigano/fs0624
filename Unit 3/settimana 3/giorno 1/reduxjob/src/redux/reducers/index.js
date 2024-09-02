const initialState = {
  favorite: {
    companies: [],
  },
};

const mainReducer = (state = initialState, action) => {
  switch (action.type) {
    case "ADD_TO_FAVORITES":
      return {
        ...state,
        favorite: {
          ...state.favorite,
          companies: [...state.favorite.companies, action.payload],
        },
      };
    default: {
      return state;
    }
  }
};

export default mainReducer;
