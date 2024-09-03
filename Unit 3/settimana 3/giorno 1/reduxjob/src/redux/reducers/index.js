import { REMOVE_FROM_FAVORITES } from "../actions";
import { ADD_TO_FAVORITES } from "../actions";

const initialState = {
  favorite: {
    companies: [],
  },
};

const mainReducer = (state = initialState, action) => {
  switch (action.type) {
    case ADD_TO_FAVORITES:
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
    case REMOVE_FROM_FAVORITES:
      return {
        ...state,
        favorite: {
          ...state.favorite,
          companies: state.favorite.companies.filter(
            (companies, i) => i !== action.payload
          ),
        },
      };
  }
};

export default mainReducer;
