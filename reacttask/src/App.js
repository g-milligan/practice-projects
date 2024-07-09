import logo from './logo.svg';
import './App.css';
import MyTaskList from './pages/MyTaskList';
import NavBar from './component/NavBar';
import { Routes, Route, Navigate } from 'react-router-dom';

function App() {
  return (
    <>
      <NavBar />
      <Routes>
        <Route path="/" element={<Navigate to="/tasks" />} />
        <Route path="/tasks" element={<MyTaskList />} />
      </Routes>
    </>
  );
}

export default App;
