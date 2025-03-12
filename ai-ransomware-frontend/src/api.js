import axios from "axios";

const API_BASE_URL = process.env.REACT_APP_API_BASE_URL;

export const fetchData = async () => {
  try {
    const response = await axios.get(`${API_BASE_URL}/api/data`);
    return response.data;
  } catch (error) {
    console.error("Error fetching data:", error);
  }
};
