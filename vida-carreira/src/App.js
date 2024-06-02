import React, { useState } from "react";
import Carousel from "react-elastic-carousel";
import Item, { Title } from "./Item";
import "./App.css";
import ReactPlayer from "react-player";
import HeroSection from "./HeroSection";
import {
    aiCourseData,
    backendJson,
    databaseCourseData,
    resumeCourseData,
    serviceData,
} from "./api";
import NavBar from "./NavBar";

const breakPoints = [
    { width: 1, itemsToShow: 1 },
    { width: 550, itemsToShow: 2, itemsToScroll: 2 },
    { width: 768, itemsToShow: 3 },
    { width: 1200, itemsToShow: 4 },
];

function App() {
    return (
        <>
            <NavBar />
            <div className="App">
                <HeroSection />
                <hr className="seperator" />
                <div className="carousel-wrapper">
                    {/*  */}
                    <div id="front" style={{ height: "80vh" }}>
                        <Title>Aulas Front-End</Title>
                        <Carousel breakPoints={breakPoints}>
                            {serviceData.map((item) => (
                                <Item key={item}>
                                    <ReactPlayer
                                        url={item.url}
                                        controls={true}
                                        width={"100%"}
                                        height={"60%"}
                                    />
                                    <p>{item.nome}</p>
                                </Item>
                            ))}
                        </Carousel>
                    </div>

                    {/*  */}
                    <div id="back" style={{ height: "80vh" }}>
                        <Title>Aulas Back-end</Title>
                        <Carousel breakPoints={breakPoints}>
                            {backendJson.map((item) => (
                                <Item key={item}>
                                    <ReactPlayer
                                        url={item.url}
                                        controls={true}
                                        width={"100%"}
                                        height={"60%"}
                                    />
                                    <p>{item.nome}</p>
                                </Item>
                            ))}
                        </Carousel>
                    </div>

                    {/*  */}
                    <div id="bd" style={{ height: "80vh" }}>
                        <Title>Aulas Banco de Dados</Title>
                        <Carousel breakPoints={breakPoints}>
                            {databaseCourseData.map((item) => (
                                <Item key={item}>
                                    <ReactPlayer
                                        url={item.url}
                                        controls={true}
                                        width={"100%"}
                                        height={"60%"}
                                    />
                                    <p>{item.nome}</p>
                                </Item>
                            ))}
                        </Carousel>
                    </div>

                    {/*  */}
                    <div id="ia" style={{ height: "80vh" }}>
                        <Title>Aulas Inteligência Artificial</Title>
                        <Carousel breakPoints={breakPoints}>
                            {aiCourseData.map((item) => (
                                <Item key={item}>
                                    <ReactPlayer
                                        url={item.url}
                                        controls={true}
                                        width={"100%"}
                                        height={"60%"}
                                    />
                                    <p>{item.nome}</p>
                                </Item>
                            ))}
                        </Carousel>
                    </div>

                    {/*  */}
                    <div id="resume" style={{ height: "80vh" }}>
                        <Title>Aulas criação de curriculos</Title>
                        <div style={{ paddingBottom: "2rem" }}>
                            <Carousel breakPoints={breakPoints}>
                                {resumeCourseData.map((item) => (
                                    <Item key={item}>
                                        <ReactPlayer
                                            url={item.url}
                                            controls={true}
                                            width={"100%"}
                                            height={"60%"}
                                        />
                                        <p>{item.nome}</p>
                                    </Item>
                                ))}
                            </Carousel>
                        </div>
                    </div>
                </div>
            </div>
        </>
    );
}

export default App;
