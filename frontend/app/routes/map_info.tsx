


export default function MapInfo( params ){
  return (
    <>
        <div className="map-info-container">
            <div className="map-info-name-container">
                <p className="map-info-label" >Map name : </p>
                <p>{params.name}</p>
            </div>
            <div className="map-info-step-container">
                <p className="map-info-label" >Step count : </p>
                <p>{params.score}</p>
            </div>
        </div>
    </>
  );
}