import { emojiMap } from "./emoji_map";

export default function RouteComponent() {
    return (
        <>
            <div className="rule-apge">
                <details open="true">
                    <summary className="rule-section">lehetséges lépések</summary>
                    <div className="rule-content">
                    <p>A pályán kezdetben 4 féle szimbólum helyezkedik el</p>
                    <ul className="rule-list">
                        <li>Játékos : {emojiMap.get("p")}</li>
                        <li>Box : {emojiMap.get("b")}</li>
                        <li>Target : {emojiMap.get("t")}</li>
                        <li>Wall : {emojiMap.get("w")}</li>
                    </ul>
                    <p>
                        A Játékos a pályána a jobb alsó sarokban elhelyezett nyilakkal léphet.
                        Egy mezőt a nyilak irányába.
                        <br />
                        Nem léphet a falra és nem léphet le a pályáról.
                        <br />
                        Ha boxra lépne eltolja azt az adott irányba.
                    </p>
                    <p>
                        A játék célja, hogy a játékos az összes boxot valamelyik targetra tolja.
                        <br />
                        Mindegy, hogy melyik box, melyik targetra ér el.
                        <br />
                        Ha egy box egy targon helyezkdeik el egy zöld négyzet jelzi {emojiMap.get("tb")}.
                        <br />
                        Ha minden box valamelyik targeton foglal helyet egy üzenet jelzi, hogy a rejtvény megoldva.
                        <br />
                        Az ok gombra kattintva a játék elmenti az eredményt és visszalép a dashboardra.
                    </p>
                    <p>Az eredmények a Scores fül alatt érhetőek el.</p>
                    </div>
                </details>
            </div>
        </>
    );
}