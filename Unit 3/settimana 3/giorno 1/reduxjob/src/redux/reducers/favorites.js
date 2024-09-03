import { REMOVE_FROM_FAVORITES } from "../actions";
import { ADD_TO_FAVORITES } from "../actions";

const initialState = {
  companies: [],
};

const favoriteReducer = (state = initialState, action) => {
  switch (action.type) {
    case ADD_TO_FAVORITES:
      return {
        ...state,
        companies: [...state.companies, action.payload],
      };
    case REMOVE_FROM_FAVORITES:
      return {
        ...state,
        companies: state.companies.filter(
          (companies, i) => i !== action.payload
        ),
      };

    default: {
      return state;
    }
  }
};

export default favoriteReducer;
