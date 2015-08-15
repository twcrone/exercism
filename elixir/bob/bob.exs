defmodule Teenager do
  def hey(input) do
  	if String.ends_with? input, "!" do
  	  "Whoa, chill out!"
  	else
  	  "Whatever."
  	end
  end
end
