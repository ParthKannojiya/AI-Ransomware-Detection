import { Routes, Route } from "react-router-dom";
import Home from "./pages/Home";
import Reports from "./pages/Reports";
import Navbar from "./components/Navbar";  // ✅ Import Navbar

function App() {
  return (
    <>
      <Navbar />  {/* ✅ Navbar Added */}
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/reports" element={<Reports />} />
      </Routes>
    </>
  );
}

export default App;
