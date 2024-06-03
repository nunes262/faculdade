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
                    <div
                        id="front"
                        style={{
                            height: "100vh",
                            width: "100%",
                            display: "flex",
                            flexDirection: "column",
                            justifyContent: "center",
                            alignItems: "center",
                            gap: "20px",
                        }}
                    >
                        <Title>Front-End</Title>
                        <div style={{ width: "70%" }}>
                            <span
                                style={{
                                    fontFamily: "Raleway, sans-serif",
                                    fontWeight: "300",
                                    color: "#080808",
                                    textAlign: "justify",
                                }}
                            >
                                Front-end é a parte de um site ou aplicação web
                                que interage diretamente com os usuários. É o
                                que as pessoas veem e com o que interagem em um
                                navegador. Envolve a criação da interface de
                                usuário (UI) e da experiência do usuário (UX),
                                utilizando tecnologias como HTML (para
                                estrutura), CSS (para estilo) e JavaScript (para
                                interatividade).
                                <br></br>
                                <br></br>O trabalho de front-end engloba a
                                criação de layouts, design responsivo (que se
                                adapta a diferentes tamanhos de tela),
                                acessibilidade, otimização de desempenho e
                                usabilidade. Os desenvolvedores front-end
                                trabalham para garantir que a interface seja
                                intuitiva, funcional e esteticamente agradável,
                                colaborando frequentemente com designers e
                                desenvolvedores back-end, que cuidam da lógica e
                                do armazenamento de dados da aplicação.
                            </span>
                        </div>
                        <div style={{ width: "95%" }}>
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
                    </div>

                    {/*  */}
                    <div
                        id="back"
                        style={{
                            height: "100vh",
                            width: "100%",
                            display: "flex",
                            flexDirection: "column",
                            justifyContent: "center",
                            alignItems: "center",
                            gap: "20px",
                        }}
                    >
                        <Title>Back-end</Title>
                        <div style={{ width: "70%" }}>
                            <span
                                style={{
                                    fontFamily: "Raleway, sans-serif",
                                    fontWeight: "300",
                                    color: "#080808",
                                    textAlign: "justify",
                                }}
                            >
                                O back-end é a parte de um sistema ou aplicação
                                responsável por gerenciar a lógica de negócios,
                                processamento de dados e comunicação com o banco
                                de dados e outros serviços. Diferente do
                                front-end, que lida com a interface do usuário e
                                a experiência visual, o back-end opera nos
                                bastidores, garantindo que tudo funcione
                                corretamente.
                                <br></br>
                                <br></br>Linguagens de programação comuns para o
                                back-end incluem Python, Java, Ruby, PHP, e
                                Node.js. As funções essenciais do back-end
                                garantem que os dados sejam processados
                                corretamente, seguros e que a aplicação funcione
                                de maneira eficiente.
                            </span>
                        </div>
                        <div style={{ width: "95%" }}>
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
                    </div>

                    {/*  */}
                    <div
                        id="bd"
                        style={{
                            height: "100vh",
                            width: "100%",
                            display: "flex",
                            flexDirection: "column",
                            justifyContent: "center",
                            alignItems: "center",
                            gap: "20px",
                        }}
                    >
                        <Title>Banco de Dados</Title>
                        <div style={{ width: "70%" }}>
                            <span
                                style={{
                                    fontFamily: "Raleway, sans-serif",
                                    fontWeight: "300",
                                    color: "#080808",
                                    textAlign: "justify",
                                }}
                            >
                                Um banco de dados é uma coleção organizada de
                                informações armazenadas eletronicamente em um
                                sistema de computador, permitindo fácil acesso,
                                gerenciamento e atualização desses dados. Eles
                                são gerenciados por sistemas de gerenciamento de
                                banco de dados (SGBD) como MySQL, PostgreSQL e
                                Oracle Database, que fornecem ferramentas para
                                criar, manter e manipular os dados.
                                <br></br>
                                <br></br>
                                Existem diferentes tipos de bancos de dados,
                                como os relacionais, que armazenam dados em
                                tabelas usando SQL; os não-relacionais (NoSQL),
                                que utilizam modelos como documentos, grafos ou
                                pares chave-valor para maior flexibilidade; e os
                                bancos de dados em memória, que armazenam dados
                                na memória principal para acesso rápido. Essas
                                ferramentas são essenciais para a organização e
                                operação eficiente de grandes volumes de
                                informações em sistemas modernos.
                            </span>
                        </div>
                        <div style={{ width: "95%" }}>
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
                    </div>

                    {/*  */}
                    <div
                        id="ia"
                        style={{
                            height: "100vh",
                            width: "100%",
                            display: "flex",
                            flexDirection: "column",
                            justifyContent: "center",
                            alignItems: "center",
                            gap: "20px",
                        }}
                    >
                        <Title>Inteligência Artificial</Title>
                        <div style={{ width: "70%" }}>
                            <span
                                style={{
                                    fontFamily: "Raleway, sans-serif",
                                    fontWeight: "300",
                                    color: "#080808",
                                    textAlignLast: "justify",
                                }}
                            >
                                Inteligência Artificial (IA) é um campo da
                                ciência da computação que se dedica à criação de
                                sistemas e máquinas capazes de realizar tarefas
                                que normalmente requerem inteligência humana.
                                Essas tarefas incluem aprendizado, raciocínio,
                                percepção, reconhecimento de padrões, tomada de
                                decisões e compreensão da linguagem natural. A
                                IA utiliza algoritmos e modelos matemáticos para
                                processar grandes volumes de dados e aprender
                                com eles, melhorando seu desempenho ao longo do
                                tempo.
                                <br></br>
                                <br></br>
                                Existem diversas abordagens e subcampos dentro
                                da IA, como o aprendizado de máquina (machine
                                learning), que permite que as máquinas aprendam
                                a partir de dados sem serem explicitamente
                                programadas; a visão computacional, que capacita
                                sistemas a interpretar e compreender imagens e
                                vídeos; e o processamento de linguagem natural,
                                que envolve a interação entre computadores e
                                linguagem humana. A IA é aplicada em diversas
                                áreas, incluindo saúde, finanças, transporte e
                                atendimento ao cliente, trazendo inovações
                                significativas e transformando a maneira como
                                interagimos com a tecnologia.
                            </span>
                        </div>
                        <div style={{ width: "95%" }}>
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
                    </div>

                    {/*  */}
                    <div
                        id="resume"
                        style={{
                            height: "100vh",
                            width: "100%",
                            display: "flex",
                            flexDirection: "column",
                            justifyContent: "center",
                            alignItems: "center",
                            gap: "20px",
                        }}
                    >
                        <Title>Criação de curriculos</Title>
                        <div style={{ width: "70%" }}>
                            <span
                                style={{
                                    fontFamily: "Raleway, sans-serif",
                                    fontWeight: "300",
                                    color: "#080808",
                                    textAlign: "justify",
                                }}
                            >
                                Ter um bom currículo é importante porque é a
                                primeira impressão que você deixa para
                                potenciais empregadores. Um currículo bem
                                elaborado destaca suas qualificações,
                                habilidades e experiências de forma clara e
                                concisa, ajudando a demonstrar por que você é a
                                melhor escolha para a vaga. Ele serve como uma
                                ferramenta de marketing pessoal, capturando a
                                atenção dos recrutadores e aumentando suas
                                chances de ser chamado para uma entrevista.
                                <br></br>
                                <br></br>
                                Além disso, um bom currículo ajuda a organizar e
                                refletir sobre sua trajetória profissional,
                                permitindo que você identifique e destaque seus
                                pontos fortes e realizações mais relevantes.
                                Isso não só facilita a busca por emprego, mas
                                também proporciona confiança ao candidatar-se
                                para diferentes posições, mostrando aos
                                empregadores que você é um candidato preparado e
                                profissional.
                            </span>
                        </div>
                        <div style={{ paddingBottom: "2rem", width: "95%" }}>
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
