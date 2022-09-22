import React from 'react'
import './header.css'
import CTA from './CTA'
import MAP from '../../assets/maps.jpg'
import HeaderSocials from './headerSocials'

const experience = () => {
  return (
    <header>
      <div className="container header_container">
        <h1>Welcome to </h1>
        <h5 className="text-light">  </h5>
        {/* <CTA /> */}
        <HeaderSocials />

        <div className="me">
          <img src={MAP} alt="VN" />
        </div>

        <a href="#contact" className="scroll_down" >Scoll Down</a>
      </div>
    </header>
  )
}

export default experience