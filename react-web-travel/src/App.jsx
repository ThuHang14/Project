// link file ~ html
import React from 'react'
// link header...
import Headers from './components/header/header'
import Nav from './components/nav/nav' // == <Nav /> 
import Abount from './components/about/about'
import Experience from './components/experience/experience'
import Services from './components/services/services'
import Portfolio from './components/portfolio/portfolio'
import Testimonials from './components/testimonials/testimonials'
import Contact from './components/contact/contact'
import Footer from './components/footer/footer'

 const App = () => {
  return (
   <>
   <Headers /> 
    <Nav /> {/* menu */}
   <Abount />  {/* di san */}
   {/* <Experience /> */}
   <Portfolio />  {/* ava du lich  */}
   <Services /> {/* 3 mien */}
 <Testimonials />    {/* go eat */}
   <Contact />
   <Footer />
   </>
  )
}

export default App
