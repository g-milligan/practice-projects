import { NavLink } from "react-router-dom";

const NavBar = () => {
  return (
    <>
      <ul className="navigation">
        <li>
          <NavLink to="/">Home</NavLink>
        </li>
        <li>
          <NavLink to="/tasks">Tasks</NavLink>
        </li>
      </ul>
    </>
  );
};

export default NavBar;
