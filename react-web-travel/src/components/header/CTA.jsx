import React from 'react'
import CV from '../../assets/cv.pdf'

const CTA = () => {
  return (
    <div className="cta">
       <a href={CV} download className="btn">Dow CV</a>
       <a href="#constact" className="btn btn-primary">Lest talk</a>
        </div>
  )
}

export default CTA