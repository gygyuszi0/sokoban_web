import { checkMap } from "./emoji_map";



export default function MapInfo(params) {
    function Shift() {
        const isShift = (
            <div className="map-info-step-container">
                <p className="map-info-label" >Shift : </p>
                <p className="map-info-value">{checkMap.get(params.shift)}</p>
            </div>
        )
        const notShift = (
            <></>
        )
        let shift = notShift;
        if (params.shift != null){
            shift = isShift;
        }
        return shift;
    }
    return (
        <>
            <div className="map-info-container">
                <p>{params.shift}</p>
                <div className="map-info-name-container">
                    <p className="map-info-label" >Map name : </p>
                    <p className="map-info-value">{params.name}</p>
                </div>
                <div className="map-info-step-container">
                    <p className="map-info-label" >Step count : </p>
                    <p className="map-info-value">{params.score}</p>
                </div>
                <Shift shift={params.shift}></Shift>

            </div>
        </>
    );
}