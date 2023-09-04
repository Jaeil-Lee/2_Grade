import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';  // App.js 라고 js 붙여도 된다
// import reportWebVitals from './reportWebVitals';   굳이 필요 없다.


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <>
    <App />
    <App></App>
  </>
);

// reportWebVitals();
