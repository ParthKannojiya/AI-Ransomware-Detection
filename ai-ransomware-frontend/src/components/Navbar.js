import { Link } from "react-router-dom";
import "./Navbar.css"; // ✅ Ensure Navbar CSS is linked

function Navbar() {
  return (
    <nav className="navbar">
      <h1 className="logo">AI Ransomware</h1>
      <div className="nav-links">
        <Link to="/">🏠 Home</Link>
        <Link to="/reports">📊 Reports</Link>
      </div>
    </nav>
  );
}

export default Navbar;
