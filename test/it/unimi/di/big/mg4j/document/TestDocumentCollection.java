package it.unimi.di.big.mg4j.document;

import org.apache.commons.configuration.ConfigurationException;

public class TestDocumentCollection extends StringArrayDocumentCollection {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("hiding")
	public final static String[] document = new String[] {
		"                    GNU GENERAL PUBLIC LICENSE X X X",
		"                       Version 3, 29 June 2007 X X X",
		" Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/> X X X",
		" Everyone is permitted to copy and distribute verbatim copies X X X",
		" of this license document, but changing it is not allowed. X X X",
		"                            Preamble X X X",
		"  The GNU General Public License is a free, copyleft license for X X X",
		"software and other kinds of works. X X X",
		"  The licenses for most software and other practical works are designed X X X",
		"to take away your freedom to share and change the works.  By contrast, X X X",
		"the GNU General Public License is intended to guarantee your freedom to X X X",
		"share and change all versions of a program--to make sure it remains free X X X",
		"software for all its users.  We, the Free Software Foundation, use the X X X",
		"GNU General Public License for most of our software; it applies also to X X X",
		"any other work released this way by its authors.  You can apply it to X X X",
		"your programs, too. X X X",
		"  When we speak of free software, we are referring to freedom, not X X X",
		"price.  Our General Public Licenses are designed to make sure that you X X X",
		"have the freedom to distribute copies of free software (and charge for X X X",
		"them if you wish), that you receive source code or can get it if you X X X",
		"want it, that you can change the software or use pieces of it in new X X X",
		"free programs, and that you know you can do these things. X X X",
		"  To protect your rights, we need to prevent others from denying you X X X",
		"these rights or asking you to surrender the rights.  Therefore, you have X X X",
		"certain responsibilities if you distribute copies of the software, or if X X X",
		"you modify it: responsibilities to respect the freedom of others. X X X",
		"  For example, if you distribute copies of such a program, whether X X X",
		"gratis or for a fee, you must pass on to the recipients the same X X X",
		"freedoms that you received.  You must make sure that they, too, receive X X X",
		"or can get the source code.  And you must show them these terms so they X X X",
		"know their rights. X X X",
		"  Developers that use the GNU GPL protect your rights with two steps: X X X",
		"(1) assert copyright on the software, and (2) offer you this License X X X",
		"giving you legal permission to copy, distribute and/or modify it. X X X",
		"  For the developers' and authors' protection, the GPL clearly explains X X X",
		"that there is no warranty for this free software.  For both users' and X X X",
		"authors' sake, the GPL requires that modified versions be marked as X X X",
		"changed, so that their problems will not be attributed erroneously to X X X",
		"authors of previous versions. X X X",
		"  Some devices are designed to deny users access to install or run X X X",
		"modified versions of the software inside them, although the manufacturer X X X",
		"can do so.  This is fundamentally incompatible with the aim of X X X",
		"protecting users' freedom to change the software.  The systematic X X X",
		"pattern of such abuse occurs in the area of products for individuals to X X X",
		"use, which is precisely where it is most unacceptable.  Therefore, we X X X",
		"have designed this version of the GPL to prohibit the practice for those X X X",
		"products.  If such problems arise substantially in other domains, we X X X",
		"stand ready to extend this provision to those domains in future versions X X X",
		"of the GPL, as needed to protect the freedom of users. X X X",
		"  Finally, every program is threatened constantly by software patents. X X X",
		"States should not allow patents to restrict development and use of X X X",
		"software on general-purpose computers, but in those that do, we wish to X X X",
		"avoid the special danger that patents applied to a free program could X X X",
		"make it effectively proprietary.  To prevent this, the GPL assures that X X X",
		"patents cannot be used to render the program non-free. X X X",
		"  The precise terms and conditions for copying, distribution and X X X",
		"modification follow.",
		"                    GNU GENERAL PUBLIC LICENSE X X X",
		"                       Version 3, 29 June 2007 X X X",
		" Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/> X X X",
		" Everyone is permitted to copy and distribute verbatim copies X X X",
		" of this license document, but changing it is not allowed. X X X",
		"                            Preamble X X X",
		"  The GNU General Public License is a free, copyleft license for X X X",
		"software and other kinds of works. X X X",
		"  The licenses for most software and other practical works are designed X X X",
		"to take away your freedom to share and change the works.  By contrast, X X X",
		"the GNU General Public License is intended to guarantee your freedom to X X X",
		"share and change all versions of a program--to make sure it remains free X X X",
		"software for all its users.  We, the Free Software Foundation, use the X X X",
		"GNU General Public License for most of our software; it applies also to X X X",
		"any other work released this way by its authors.  You can apply it to X X X",
		"your programs, too. X X X",
		"  When we speak of free software, we are referring to freedom, not X X X",
		"price.  Our General Public Licenses are designed to make sure that you X X X",
		"have the freedom to distribute copies of free software (and charge for X X X",
		"them if you wish), that you receive source code or can get it if you X X X",
		"want it, that you can change the software or use pieces of it in new X X X",
		"free programs, and that you know you can do these things. X X X",
		"  To protect your rights, we need to prevent others from denying you X X X",
		"these rights or asking you to surrender the rights.  Therefore, you have X X X",
		"certain responsibilities if you distribute copies of the software, or if X X X",
		"you modify it: responsibilities to respect the freedom of others. X X X",
		"  For example, if you distribute copies of such a program, whether X X X",
		"gratis or for a fee, you must pass on to the recipients the same X X X",
		"freedoms that you received.  You must make sure that they, too, receive X X X",
		"or can get the source code.  And you must show them these terms so they X X X",
		"know their rights. X X X",
		"  Developers that use the GNU GPL protect your rights with two steps: X X X",
		"(1) assert copyright on the software, and (2) offer you this License X X X",
		"giving you legal permission to copy, distribute and/or modify it. X X X",
		"  For the developers' and authors' protection, the GPL clearly explains X X X",
		"that there is no warranty for this free software.  For both users' and X X X",
		"authors' sake, the GPL requires that modified versions be marked as X X X",
		"changed, so that their problems will not be attributed erroneously to X X X",
		"authors of previous versions. X X X",
		"  Some devices are designed to deny users access to install or run X X X",
		"modified versions of the software inside them, although the manufacturer X X X",
		"can do so.  This is fundamentally incompatible with the aim of X X X",
		"protecting users' freedom to change the software.  The systematic X X X",
		"pattern of such abuse occurs in the area of products for individuals to X X X",
		"use, which is precisely where it is most unacceptable.  Therefore, we X X X",
		"have designed this version of the GPL to prohibit the practice for those X X X",
		"products.  If such problems arise substantially in other domains, we X X X",
		"stand ready to extend this provision to those domains in future versions X X X",
		"of the GPL, as needed to protect the freedom of users. X X X",
		"  Finally, every program is threatened constantly by software patents. X X X",
		"States should not allow patents to restrict development and use of X X X",
		"software on general-purpose computers, but in those that do, we wish to X X X",
		"avoid the special danger that patents applied to a free program could X X X",
		"make it effectively proprietary.  To prevent this, the GPL assures that X X X",
		"patents cannot be used to render the program non-free. X X X",
		"  The precise terms and conditions for copying, distribution and X X X",
		"modification follow.",
		"                    GNU GENERAL PUBLIC LICENSE X X X",
		"                       Version 3, 29 June 2007 X X X",
		" Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/> X X X",
		" Everyone is permitted to copy and distribute verbatim copies X X X",
		" of this license document, but changing it is not allowed. X X X",
		"                            Preamble X X X",
		"  The GNU General Public License is a free, copyleft license for X X X",
		"software and other kinds of works. X X X",
		"  The licenses for most software and other practical works are designed X X X",
		"to take away your freedom to share and change the works.  By contrast, X X X",
		"the GNU General Public License is intended to guarantee your freedom to X X X",
		"share and change all versions of a program--to make sure it remains free X X X",
		"software for all its users.  We, the Free Software Foundation, use the X X X",
		"GNU General Public License for most of our software; it applies also to X X X",
		"any other work released this way by its authors.  You can apply it to X X X",
		"your programs, too. X X X",
		"  When we speak of free software, we are referring to freedom, not X X X",
		"price.  Our General Public Licenses are designed to make sure that you X X X",
		"have the freedom to distribute copies of free software (and charge for X X X",
		"them if you wish), that you receive source code or can get it if you X X X",
		"want it, that you can change the software or use pieces of it in new X X X",
		"free programs, and that you know you can do these things. X X X",
		"  To protect your rights, we need to prevent others from denying you X X X",
		"these rights or asking you to surrender the rights.  Therefore, you have X X X",
		"certain responsibilities if you distribute copies of the software, or if X X X",
		"you modify it: responsibilities to respect the freedom of others. X X X",
		"  For example, if you distribute copies of such a program, whether X X X",
		"gratis or for a fee, you must pass on to the recipients the same X X X",
		"freedoms that you received.  You must make sure that they, too, receive X X X",
		"or can get the source code.  And you must show them these terms so they X X X",
		"know their rights. X X X",
		"  Developers that use the GNU GPL protect your rights with two steps: X X X",
		"(1) assert copyright on the software, and (2) offer you this License X X X",
		"giving you legal permission to copy, distribute and/or modify it. X X X",
		"  For the developers' and authors' protection, the GPL clearly explains X X X",
		"that there is no warranty for this free software.  For both users' and X X X",
		"authors' sake, the GPL requires that modified versions be marked as X X X",
		"changed, so that their problems will not be attributed erroneously to X X X",
		"authors of previous versions. X X X",
		"  Some devices are designed to deny users access to install or run X X X",
		"modified versions of the software inside them, although the manufacturer X X X",
		"can do so.  This is fundamentally incompatible with the aim of X X X",
		"protecting users' freedom to change the software.  The systematic X X X",
		"pattern of such abuse occurs in the area of products for individuals to X X X",
		"use, which is precisely where it is most unacceptable.  Therefore, we X X X",
		"have designed this version of the GPL to prohibit the practice for those X X X",
		"products.  If such problems arise substantially in other domains, we X X X",
		"stand ready to extend this provision to those domains in future versions X X X",
		"of the GPL, as needed to protect the freedom of users. X X X",
		"  Finally, every program is threatened constantly by software patents. X X X",
		"States should not allow patents to restrict development and use of X X X",
		"software on general-purpose computers, but in those that do, we wish to X X X",
		"avoid the special danger that patents applied to a free program could X X X",
		"make it effectively proprietary.  To prevent this, the GPL assures that X X X",
		"patents cannot be used to render the program non-free. X X X",
		"  The precise terms and conditions for copying, distribution and X X X",
		"modification follow."
	};
	
	public TestDocumentCollection() throws ConfigurationException {
		super( document ); 
	}

	public TestDocumentCollection( final String uris ) throws ConfigurationException {
		super( Boolean.parseBoolean( uris ), document ); 
	}
}
