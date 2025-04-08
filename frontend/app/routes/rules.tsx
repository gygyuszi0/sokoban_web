import { emojiMap } from "./emoji_map";

export default function RouteComponent() {
    return (
        <>
            <div className="rule-apge">
                <details>
                    <summary className="rule-section">Hagyományos játékmód</summary>
                    <div className="rule-content">
                        <p>A dashboardról a Play opcióval érhető el.</p>
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
                <details open="true">
                    <summary className="rule-section">Shift játékmód</summary>
                    <div className="rule-content">
                        <p>A dashboardról a Play with shift menűből érhető el.</p>
                        <p>A szimbólumok, a navigáció és a cél ugyan az mint a normál játékmódban.</p>
                        <p>Az új funkció ebben a módban az, hogy a játékos a <i>target</i> mezőket is el tudja tolni, melynek szabályai:</p>
                        <ul>
                            <li>A képernyő jobb alsó srakában található <i>Shift</i> gomb segítségével lehet módot váltani.</li>
                            <li>Ha a shift értéke igaz, a játékos el tudja tolni a target mezőket, a dobozokkal azonos szabály szerint.</li>
                            <li>A shift állapotát a képernyő tetején elhelyezkedő állapotsáv jelzi.</li>
                        </ul>
                        <p>A játék a normál mód szerint ér véget, az üzenet feldobásakor az <i>OK</i> gombra kattintva.</p>
                    </div>
                </details >
            </div >
        </>
    );
}