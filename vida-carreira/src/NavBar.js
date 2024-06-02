import styled from "styled-components";

const Wrapper = styled.div`
    @media (min-width: 768px) {
        position: fixed;
    }
    width: 100%;
    z-index: 20;
    transition: all 0.3s;
    height: 3ch;
`;

const DesktopNav = styled.div`
    display: none;
    @media (min-width: 1024px) {
        display: block;
    }
    animation: fadeIn 0.3s ease-in-out, zoomIn 0.3s ease-in-out;
    background-color: white;
    height: auto;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
`;

const NavContent = styled.div`
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100%;
    margin: 0 auto;
    padding: 1rem;
`;

const NavLinks = styled.div`
    display: flex;
    gap: 50px;
    font-size: 16px;
    align-items: center;
    user-select: none;
`;

const Link = styled.a`
    &:hover {
        color: darkblue;
    }
    cursor: pointer;
    display: flex;
    align-items: center;
    gap: 8px;
    font-weight: 500;
    color: gray;
    text-decoration: none;
`;

function NavBar() {
    const links = [
        { name: "Front-End", id: "1", href: "#front" },
        { name: "Back-End", id: "2", href: "#back" },
        { name: "Banco de dados", id: "3", href: "#bd" },
        { name: "Inteligencia Artificial", id: "4", href: "#ia" },
        { name: "Criação de curriculos", id: "5", href: "#resume" },
    ];

    return (
        <Wrapper>
            <DesktopNav>
                <NavContent>
                    <NavLinks>
                        {links.map((link) => (
                            <Link key={link.id} href={link.href}>
                                {link.name}
                            </Link>
                        ))}
                    </NavLinks>
                </NavContent>
            </DesktopNav>
        </Wrapper>
    );
}

export default NavBar;
