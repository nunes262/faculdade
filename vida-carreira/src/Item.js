import styled from "styled-components";

export default styled.div`
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
        font-size: 16px;
        font-weight: bold;
        align-self: center;
        color: black;
        text-align: center;
    }
`;

export const Title = styled.h1`
    padding-left: 6rem;
    font-weight: bold;
    font-size: 40px;
    color: darkblue;
`;
