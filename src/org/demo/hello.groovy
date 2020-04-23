package org.demo

def printMessage(msg) {
  sh 'echo "\${msg}"'
}
