import styled from "styled-components";

export default styled.div`
    border: 1px solid gray;
    padding: 6px;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: flex-start;
    height: 300px;
    width: 100%;
    margin: 15px;
    color: darkblue;

    p {
        margin: 0;
        padding: 0;
        font-size: 20px;
        font-weight: bold;
        color: black;

        text-align: center;
    }
`;

export const Title = styled.h1`
    padding-left: 6rem;
    font-family: "Raleway", sans-serif;
    font-weight: 300;
    font-size: 40px;
    color: #080808;
    color: darkblue;
`;
