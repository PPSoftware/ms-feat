# ms-feat
Microserviço para lidar com as requisições envolvendo os talentos


No application.yml vc encontra as configurações de portas e conexão com o banco de dados postgresql.

É necessário a instalação do POSTGRESQL versão 10+ e do PGADMIN versão 4+, criar o database ms_feats sem adicionar nenhuma tabela, na configuração do application.yml há uma opção spring.jpa.hibernate.ddl-auto que está setado em create-drop, para persistir os dados e o banco quando vc descer a aplicação basta trocar para update.
