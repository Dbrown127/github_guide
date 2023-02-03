import axios from "axios";

const API_URL = "http://localhost:8081/capstoneApi/auth/";

const register = (firstName, lastName, email, password) => {
  return axios.post(API_URL + "register", {
    firstName,
    lastName,
    email,
    password,
   
  });
};

const login = async (username, password) => {
  const response = await axios
    .post(API_URL + "login", {
      username,
      password,
    });
  if (response.data.accessToken) {
    localStorage.setItem("user", JSON.stringify(response.data));
  }
  return response.data;
};

const logout = () => {
  localStorage.removeItem("user");
};

const getCurrentUser = () => {
  return JSON.parse(localStorage.getItem("user"));
};

const AuthService = {
  register,
  login,
  logout,
  getCurrentUser,
};

export default AuthService;
