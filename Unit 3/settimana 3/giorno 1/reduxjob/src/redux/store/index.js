import { configureStore, combineReducers } from "@reduxjs/toolkit";
import favoriteReducer from "../reducers/favorites";
import userReducer from "../reducers/user";

const BigReducer = combineReducers({
  favorite: favoriteReducer,
  user: userReducer,
});

const store = configureStore({
  reducer: BigReducer,
});

export default store;
