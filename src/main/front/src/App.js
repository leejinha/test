import logo from './logo.svg';
import './App.css';
import {useEffect, useState} from "react";
import React from "react";
import axios from "axios";

function App() {

    const [data, setData] = React.useState([]);

    useState(function () {
        axios
          .get(
            "http://localhost:3000/test"
          )
          .then(function (result) {
            const data = result.data;
            setData(data);
            console.log(data);
          })
          .catch(function (error) {
            console.error(error);
          });
      }, []);

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <ul>
        {
              (data.map(data =>
                    <li key={data.id}>{data.name} =======> {data.grade}</li>))
        }
            {data && <textarea rows={20} value={JSON.stringify(data, null, 2)} readOnly={true} />}
        </ul>

      </header>
    </div>
  );
}

export default App;
