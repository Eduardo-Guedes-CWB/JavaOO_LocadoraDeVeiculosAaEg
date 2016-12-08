/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MassaTeste;

import javaoo_locadoradeveiculosaaeg.git.bancoDeDados.BancoDeDadosLocadora;
import javaoo_locadoradeveiculosaaeg.git.models.CarroModel;
import javaoo_locadoradeveiculosaaeg.git.models.CartaoDeCreditoModel;
import javaoo_locadoradeveiculosaaeg.git.models.ClientePessoaFisicaModel;
import javaoo_locadoradeveiculosaaeg.git.models.LojaModel;


/**
 *
 * @author eduar
 */
public class MassaTeste {
    public static void GerarMassaTeste(){
        for (int i = 1; i <= 10; i++) {
            CarroModel cr = new CarroModel();
            cr.setCodigo(i);
            cr.setModelo("ModeloTeste" + i);
            cr.setMarca("MarcaTeste" + i);
            cr.setAno(1966 + 1);
            cr.setCategoria("CategoriaTeste" + i);
            cr.setQuantPessoas(5);
            cr.setTipoCombustivel("Flex");
            cr.setQuilometragem(i * 100);
            cr.setValores(90);
            cr.setTaxas(10);
            
            if((i % 2) == 0){
                cr.setTipoLocacao("PF");
                cr.setNivelTanque("Cheio");
                cr.setTipoCambio("Automatico");
                cr.setPotenciaMotor("1.6 16V");
                cr.setQuantMalas(5);
                cr.setQuantPortas(4);
                cr.setAr(true);
                cr.setDirecaoHidraulica(true);
                cr.setVidroEletrico(true);
                cr.setTravaEletrica(true);
                cr.setAirBag(true);
                cr.setAbs(true);
                cr.setBlindagem(false);
                cr.setCouro(true);
                cr.setLimpeza(true);
            }else{
                cr.setTipoLocacao("PJ");
                cr.setNivelTanque("Meio");
                cr.setTipoCambio("Manual");
                cr.setPotenciaMotor("1.0");
                cr.setQuantMalas(3);
                cr.setQuantPortas(2);
                cr.setAr(false);
                cr.setDirecaoHidraulica(false);
                cr.setVidroEletrico(false);
                cr.setTravaEletrica(false);
                cr.setAirBag(false);
                cr.setAbs(false);
                cr.setBlindagem(false);
                cr.setCouro(false);
                cr.setLimpeza(false);
            }
            
            BancoDeDadosLocadora.getTabelaCarro().add(cr);
        }
        
        for (int i = 1; i <= 10; i++) {
            CartaoDeCreditoModel cc = new CartaoDeCreditoModel();
            cc.setNumeroCartao("0000 0000 0000 000"+i);
            cc.setNomeDoTitular("TesteCatão"+i);
            cc.setCodigoSegurança(100+i);
            cc.setMesValidade(i);
            cc.setAnoValidade(20+i);
            
            BancoDeDadosLocadora.getTabelaCartaoDeCredito().add(cc);
        }
        
        for (int i = 1; i <= 4; i++) {
            LojaModel lj = new LojaModel();
            lj.setNome("LojaTeste"+i);
            lj.setEndereco("EndereçoTeste"+i);
            //lj.setNumero("Numero"+i);
            lj.setCep(83409000+i);
            lj.setComplemento("Complemento"+i);
            lj.setBairro("Bairro"+i);
            lj.setCidade("Cidade"+i);
            lj.setEstado("Estado"+i);
            lj.setHorarioInicio("Incias as 08:00");
            lj.setHorarioFim("Finaliza as 18:00");
            lj.setCnpj("CNPJ"+i);
            lj.setTelefone(33330000+i);
            
            BancoDeDadosLocadora.getTabelaLoja().add(lj);
        }
        
        for (int i = 1; i <= 4; i++) {
            ClientePessoaFisicaModel pf = new ClientePessoaFisicaModel();
            pf.setNome("PessoaFisicaTeste"+i);
            pf.setTelefone(33330000+i);
            pf.setCpf("CPF"+i);
            pf.setEndereco("EndereçoPF"+i);
           // pf.setNumero("NumeroPF"+i);
            pf.setCep(83409000+i);
            pf.setComplemento("ComplementoPF"+i);
            pf.setBairro("BairroPF"+i);
            pf.setCidade("CidadePF"+i);
            pf.setEstado("EstadoPF"+i);
            pf.setCategoria("CategoriaCnhPF"+i);
            pf.setTempo("TempoCnhPF"+i);
            pf.setEstadoEmissor("EstadoEmissorcnhPF"+i);
            pf.setNumeroCnh("NumeroCnhPF"+i);
            pf.setRegistroCnh("RegistroCnhPF"+i);
            
            BancoDeDadosLocadora.getTabelaClientesPessoaFisica().add(pf);
        }
    }
}
