import { GET_RESULTS } from "../actions";

const initialState = {
  searchResults: [],
};

const searchResultsReducer = (state = initialState, action) => {
  switch (action.type) {
    case GET_RESULTS:
      return {
        ...state,
        searchResults: action.payload, // cioè l'array di libri
      };

    default:
      return state;
  }
};

export default searchResultsReducer;
