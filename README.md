# Log Fetcher
An API (JavaX-RS & Jersey Framework driven Log Fetcher) which could fetch relevant logs from multiple servers concurrently for any keyword.
Creates SSH tunnel between the hosted server and jumpbox server and returns a pseudo terminal.
Application then spawns threads , executes 'tentakel' command and grep the string to be searched in the log file.
Reponds back to the invoker as formatted object

# Mock Service
A framework to create mock responses and uploaded to mock server.
Powered by WireMock apis, this framework will create 'rules' for a specified request , dumps the response to mock server and restarts the mock server
This is extremely useful to emulate to emulate hard to find scenarios at test envt.


