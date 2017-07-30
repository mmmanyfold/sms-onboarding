(ns sms-onboard.outgoing
  (:require [sms-onboard.helpers :refer [get-env format]]))

(def ORG_NAME (get-env "ORG_NAME"))

(def messages
  {:retry  "Not a valid response. Please try again. \n\nRespuesta incorrecta, por favor vuelva a intentar."
   :step-0 (format "Welcome to %s's text alerts and news! To subscribe to receive important updates reply \"yes.\" Do not respond if you do not want to be added at this time.\n\nBienvenid@ a los alertos de texto de %s! Para inscribirse a recibir información importante, responda \"yes.\" No necesita responder si no quiere recibir mensajes por el momento." ORG_NAME ORG_NAME)
   :step-1 (format "Thank you for signing up to receive %s’s text messages! To provide you the correct information, please provide your preferred language. Reply “1” for English or “2” for Spanish. \n\n¡Gracias por inscribirse a los mensajes de %s! Para darle la información correcta, por favor designe su idioma preferido. Responda “1” para inglés o “2” para español." ORG_NAME ORG_NAME)
   :step-2 {:spanish "¡Gracias! Su idioma preferido es español. Y para comunicarnos mejor, responda con su nombre completo."
            :english "Thank you! Your preferred language is English. To best communicate with you, please respond with your full name."}
   :step-3 {:spanish (format "¡Gracias! ¡Este pendiente de la información de %s!" ORG_NAME)
            :english (format "Thank you! Stay tuned for updates from %s!" ORG_NAME)}})
