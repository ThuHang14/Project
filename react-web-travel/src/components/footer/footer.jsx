import React from 'react'
import './footer.css'
import {BsFacebook} from 'react-icons/bs'
import {AiOutlineMail} from 'react-icons/ai'
import {SiZalo} from 'react-icons/si'
import {AiFillInstagram} from 'react-icons/ai'

const experience = () => {
  return (
    <footer>
      <a href="#" className='footer_logo'>14TH</a>

      <ul className='permalinks'>
        <li><a href="#">Home</a></li>
        <li><a href="#about">About</a></li>
        <li><a href="#services">Service</a></li>
        <li><a href="#portfolio">Destinations</a></li>
        <li><a href="#testimonials">Culinary</a></li>
        <li><a href="#contact">Contact</a></li>      
      </ul>


      <div className="footer-socials">
        <a href="https://www.facebook.com/profile.php?id=100071308209620" target="_blank" rel="noopener noreferrer"><BsFacebook className='footer_logo'/></a>
        <a href="https://zalo.me/0332191490" target="_blank" rel="noopener noreferrer"><SiZalo className='footer_logo'/></a>
        <a  href="https://mail.google.com/mail/u/0/#inbox?compose=CllgCJNxNpFGJVzRQbSkctgDqjLMCRXxJvkXRRMNzFvzzGwxXWMvTsdbdwvvlSrsnTrdbGfJsZg" target="_blank" rel="noopener noreferrer"><AiOutlineMail className='footer_logo'/></a>
        <a  href="https://www.instagram.com/14septe" target="_blank" rel="noopener noreferrer"><AiFillInstagram className='footer_logo'/></a>
      </div>

      <div className="footer_copyright"></div>
    </footer>
  )
}

export default experience