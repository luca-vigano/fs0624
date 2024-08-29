import BookList from "../components/BookList";
import { render, screen } from "@testing-library/react";
import fantasybook from "../books/fantasy.json";

describe("bookList component", () => {
  it("how many component i have when load", () => {
    render(<BookList />);

    const allSingleBook = screen.getAllByTestId(/singlebook/i);

    expect(allSingleBook.length).toEqual(fantasybook.length);
  });
});
