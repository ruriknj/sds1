import React from 'react';
import { BrowserRouter, Route } from 'react-router-dom'
import Header from './components/Header/Index';
import Home from './pages/Home/Index';
import Records from './pages/Records/Index';

const Routes = () => (


    <BrowserRouter>
        <Header />
        <switch>
            <Route path="/" exact>
                <Home />
            </Route>
            <Route path="/records">
                <Records />
            </Route>
        </switch>
    </BrowserRouter>

);
export default Routes;