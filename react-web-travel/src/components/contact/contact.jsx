import React from 'react'
import './contact.css'
import {AiOutlineMail} from 'react-icons/ai'
import {BsMessenger} from 'react-icons/bs'
import {SiZalo} from 'react-icons/si'
import { useRef } from 'react';
import mailjs from 'emailjs-com';

const Contact = () => {
  const form = useRef();

  const sendEmail = (e) => {
    e.preventDefault();

    mailjs.sendForm('service_n46b0zi', 'template_crt26do', form.current, 'sA-IWKcoXrHXSmrVB')
    .then((result) => {
          console.log(result.text);
      }, (error) => {
          console.log(error.text);
      });

      e.target.reset()
  };

  return (
    <section id='contact'>
      <h5>Get In Touch</h5>
      <h2>Contact Me</h2>

    <div className="container contact_container">
      <div className="contact_options">
        <article className='contact_option'>
          <AiOutlineMail className='contact_option-icon'/>
            <h4>Mail</h4>
            <h5>14thuhang</h5>
            <a  href="https://mail.google.com/mail/u/0/#inbox?compose=CllgCJNxNpFGJVzRQbSkctgDqjLMCRXxJvkXRRMNzFvzzGwxXWMvTsdbdwvvlSrsnTrdbGfJsZg" target="_blank">Send mail</a>
        </article>

        <article className='contact_option'>
          <BsMessenger className='contact_option-icon'/>
            <h4>Messenger</h4>
            <h5>Thu Hằng</h5>
            <a  href="https://www.facebook.com/profile.php?id=100071308209620" target="_blank">Send message</a>
        </article>

        <article className='contact_option'>
          <SiZalo className='contact_option-icon'/>
            <h4>Zalo</h4>
            <h5>Thu Hằng</h5>
            <a  href="https://zalo.me/0332191490" target="_blank">Send zalo</a>
        </article>
      </div>

      {/* END CONTACT OPTION */}

      <form ref={form} onSubmit={sendEmail}>
        <input type="text" name='name' placeholder='Your Full Name' required/>
        <input type="text" name='mail' placeholder='Your Mail' required/>
        <textarea name="message" rows="7" placeholder='Your Message' required></textarea>
        <button type='submit' className='btn btn-primary'>Send Message</button>
      </form>
    </div>

    </section>
  )
}

export default Contact