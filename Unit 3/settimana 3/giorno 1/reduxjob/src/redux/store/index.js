import { configureStore, combineReducers } from "@reduxjs/toolkit";
import favoriteReducer from "../reducers/favorites";
import userReducer from "../reducers/user";
import searchResultsReducer from "../reducers/searchResults";

const BigReducer = combineReducers({
  favorite: favoriteReducer,
  user: userReducer,
  searchResults: searchResultsReducer,
});

const store = configureStore({
  reducer: BigReducer,
});

export default store;
