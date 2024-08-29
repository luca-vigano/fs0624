import CommentArea from "../components/CommentArea";
import { render, screen } from "@testing-library/react";
import fantasybook from "../books/fantasy.json";

describe("comment area test", () => {
  it("commentarea correctly mount", async () => {
    render(<CommentArea selectedBook={fantasybook[0].asin} />);

    const listGropuItem = await screen.findAllByTestId("listGroupItem");

    expect(listGropuItem.length).toBeGreaterThan(0);
  });
});
