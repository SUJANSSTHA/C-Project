import phonenumbers
import opencage
import folium
from test import number

from phonenumbers import geocoder
ch_nmber = phonenumbers.parse(number, "CH")
print(geocoder.description_for_number(ch_nmber, "en"))
print(geocoder.description_for_number(ch_nmber, "en"))