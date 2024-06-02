import image from "./images/imageLearning.svg";
import React from "react";
import styled from "styled-components";

const Section = styled.section`
    display: flex;
    justify-content: center;
    flex-direction: column;
    padding: 2rem 6rem;

    @media (min-width: 768px) {
        flex-direction: row;
    }
    gap: 12px;
    height: 100vh;
    align-items: center;
    background: linear-gradient(to bottom, #ffffff, #ffffff, #fff);
`;

const TextContainer = styled.div`
    display: flex;
    flex-direction: column;
    gap: 4px;
`;

const Title = styled.p`
    font-weight: 850;
    @media (min-width: 768px) {
        line-height: 3rem;
    }
    font-size: 1.25rem;
    @media (min-width: 768px) {
        font-size: 2.375rem;
    }
    color: darkblue;
    width: 40rem;
`;

const Description = styled.p`
    font-size: 1rem;
    font-weight: 500;
    width: 35rem;
    text-align: justify;
`;

function HeroSection() {
    return (
        <Section>
            <TextContainer>
                <Title>
                    Aprenda a programar gratuitamente e transforme seu futuro!
                </Title>
                <Description>
                    Oferecemos educação de qualidade para todos, capacitando
                    futuros profissionais da tecnologia com cursos gratuitos do
                    básico ao avançado. Adquira novas habilidades e prepare-se
                    para uma carreira de sucesso na área de tecnologia sem
                    custo. Comece sua jornada hoje mesmo!
                </Description>
            </TextContainer>
            <img
                src={image}
                alt="imagenzinha bem aleatoria"
                width={700}
                height={800}
            />
        </Section>
    );
}

export default HeroSection;
