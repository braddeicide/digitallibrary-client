DigitalLibrary-Client
=====================

Currently under heavy development, not ready for release.

Developed in Netbeans


Dependencies:

acrobad.jar from bean.jar from http://www.planetpdf.com/planetpdf/acrobat/bean/main.html

mysql-connector-java-x.x.xx-bin.jar from https://dev.mysql.com/downloads/connector/j/

Netbeans Absolute Layout from Add library, Absolute Layout.


SQL setup

CREATE DATABASE /*!32312 IF NOT EXISTS*/ digitallibrary;

USE digitallibrary;

CREATE TABLE admin (
  username varchar(50) default NULL,
  fullname varchar(50) default NULL,
  access int(1) default NULL,
  upload int(1) default NULL,
  admin int(1) default NULL
) ;

CREATE TABLE documents (
  documentid int(5) NOT NULL auto_increment,
  filename varchar(100) NOT NULL default '',
  md5 varchar(40) NOT NULL default '',
  title varchar(50) default NULL,
  author varchar(50) default NULL,
  keywords varchar(100) NOT NULL default '',
  related_author varchar(100) default NULL,
  studygroup varchar(50) default NULL,
  classification varchar(50) default NULL,
  publicationdate varchar(50) default NULL,
  PRIMARY KEY  (documentid)
) ;


CREATE TABLE groups (
  groupid int(5) NOT NULL auto_increment,
  groupname varchar(20) default NULL,
  members varchar(150) default NULL,
  PRIMARY KEY  (groupid)
) ;
