import { render, screen } from "@testing-library/react";
import Welcome from "../components/Welcome";

describe("welcome mount testing", () => {
  it("mounts correctly at launch", () => {
    render(<Welcome />);
    const welcome = screen.getByTestId(/alert/i);
    expect(welcome).toBeInTheDocument();
  });
});
