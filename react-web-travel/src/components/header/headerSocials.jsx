        /* react icon => npm install react-icons --save*/
import React from 'react'
import {BsGithub} from 'react-icons/bs'
import {BsInstagram} from 'react-icons/bs'
import {BsLinkedin} from 'react-icons/bs'

const headerSocials = () => {
  return (
    <div className="header_socials">
        <a href="http://" target="_blank" rel="noopener noreferrer"><BsGithub/></a>
        <a href="http://" target="_blank" rel="noopener noreferrer"><BsInstagram/></a>
        <a href="http://" target="_blank" rel="noopener noreferrer"><BsLinkedin/></a>
    
    </div>
  )
}

export default headerSocials