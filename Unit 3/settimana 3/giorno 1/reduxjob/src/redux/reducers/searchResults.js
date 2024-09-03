import { GET_COMPANIES } from "../actions";

const initialState = {
  searchResults: [],
};

const searchResultsReducer = (state = initialState, action) => {
  switch (action.type) {
    case GET_COMPANIES:
      return {
        ...state,
        searchResults: action.payload, // cioè l'array di compagnie
      };

    case "CLEAR_ARRAY":
      return {
        ...state,
        searchResults: [],
      };

    default:
      return state;
  }
};

export default searchResultsReducer;
