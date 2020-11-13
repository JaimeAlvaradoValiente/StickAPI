/*
 * Stick API
 * API asociada al dispositivo del bastón
 *
 * OpenAPI spec version: 1.0.0
 * Contact: you@your-company.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * InactivityTime
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-13T17:06:06.217Z[GMT]")public class InactivityTime   {
  @JsonProperty("horas")
  private Integer horas = null;

  @JsonProperty("minutos")
  private Integer minutos = null;

  @JsonProperty("segundos")
  private Integer segundos = null;

  public InactivityTime horas(Integer horas) {
    this.horas = horas;
    return this;
  }

  /**
   * Get horas
   * @return horas
   **/
  @JsonProperty("horas")
  @Schema(example = "7", required = true, description = "")
  @NotNull
  public Integer getHoras() {
    return horas;
  }

  public void setHoras(Integer horas) {
    this.horas = horas;
  }

  public InactivityTime minutos(Integer minutos) {
    this.minutos = minutos;
    return this;
  }

  /**
   * Get minutos
   * @return minutos
   **/
  @JsonProperty("minutos")
  @Schema(example = "32", required = true, description = "")
  @NotNull
  public Integer getMinutos() {
    return minutos;
  }

  public void setMinutos(Integer minutos) {
    this.minutos = minutos;
  }

  public InactivityTime segundos(Integer segundos) {
    this.segundos = segundos;
    return this;
  }

  /**
   * Get segundos
   * @return segundos
   **/
  @JsonProperty("segundos")
  @Schema(example = "33", required = true, description = "")
  @NotNull
  public Integer getSegundos() {
    return segundos;
  }

  public void setSegundos(Integer segundos) {
    this.segundos = segundos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InactivityTime inactivityTime = (InactivityTime) o;
    return Objects.equals(this.horas, inactivityTime.horas) &&
        Objects.equals(this.minutos, inactivityTime.minutos) &&
        Objects.equals(this.segundos, inactivityTime.segundos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(horas, minutos, segundos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InactivityTime {\n");
    
    sb.append("    horas: ").append(toIndentedString(horas)).append("\n");
    sb.append("    minutos: ").append(toIndentedString(minutos)).append("\n");
    sb.append("    segundos: ").append(toIndentedString(segundos)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
