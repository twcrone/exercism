defmodule Teenager do
  def hey(input) do
  	cond do
  	  String.ends_with? input, "!" -> "Whoa, chill out!"
  	  String.ends_with? input, "?" -> "Sure."
  	  true -> "Whatever."
  	end
  end
end
