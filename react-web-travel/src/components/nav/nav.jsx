import React from 'react'
import './nav.css'
import {AiFillHome} from 'react-icons/ai'
import {BsClockHistory} from 'react-icons/bs'
import {IoIosPeople} from 'react-icons/io'
import {AiFillMessage} from 'react-icons/ai'
import {useState} from 'react'

const Nav = () => {
const [activeNav, setActiveNav] = useState("#")
  return (
    <nav>
      <a href="#"
            onClick={() => setActiveNav('#')}
            className={activeNav === '#' ? "active" : ''}><AiFillHome/>
      </a>
      <a href="#about"
            onClick={() => setActiveNav('#about')}
            className={activeNav === '#about' ? "active" : ''}><BsClockHistory/>
      </a>
      <a href="#services"
            onClick={() => setActiveNav('#services')}
            className={activeNav === '#services' ? "active" : ''}><IoIosPeople/>
      </a>
      <a href="#contact"
            onClick={() => setActiveNav('#contact')}
            className={activeNav === '#contact' ? "active" : ''}><AiFillMessage/>
      </a>
    </nav>
  )
}

export default Nav