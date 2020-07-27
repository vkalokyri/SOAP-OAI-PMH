# SOAP-OAI-PMH

This repository is an extension of the OpenArchivalSystem repository (https://github.com/vkalokyri/OpenArchivalSystem) where we have implemented the OAI-PMH protocol. The OAI-PMH (Open Archival Initiative - Protocol for Metadata Harvesting) protocol defines the interaction of a collector system and a provider system for metadata harvesting (maintained by the latter). Detailed documentation for the OAI-PMH protocol can be found at: http://www.openarchives.org/OAI/openarchivesprotocol.html

In particular, we support OAI-PMH protocol (version 2.0) as an internet service (using the SOAP protocol) over the object archiving system that exists in the OpenArchivalSystem repository. Internet services are described in WSDL and exchange messages using the SOAP protocol.

Finally, in addition to this metadata format, our service is able to provide archival system metadata according to the Dublin Core standard and its extensions (Dublin Core Terms).

Technologies used
• Java
• XML
• Simple Object Access Protocol
• WSDL
• XSLT
• Axis2 Web Services Framework
• DAO

