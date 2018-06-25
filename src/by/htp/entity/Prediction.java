package by.htp.entity;

public class Prediction {
	
	private String predictions;

	public String getPredictions() {
		return predictions;
	}

	public void setPredictions(String predictions) {
		this.predictions = predictions;
	}

	public Prediction(String predictions) {
		super();
		this.predictions = predictions;
	}
///////////////// подумать
	@Override
	public String toString() {
		return "Prediction [predictions=" + predictions + "]";
	}

	public Prediction() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((predictions == null) ? 0 : predictions.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prediction other = (Prediction) obj;
		if (predictions == null) {
			if (other.predictions != null)
				return false;
		} else if (!predictions.equals(other.predictions))
			return false;
		return true;
	}

	

}
