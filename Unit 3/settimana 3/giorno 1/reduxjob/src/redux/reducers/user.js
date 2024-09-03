import { SET_USER_NAME } from "../actions";

const initialState = {
  name: "",
};

const mainReducer = (state = initialState, action) => {
  switch (action.type) {
    case SET_USER_NAME:
      return {
        ...state,
        name: action.payload,
      };

    default: {
      return state;
    }
  }
};

export default mainReducer;
